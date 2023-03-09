<script>
import dayjs from 'dayjs'

export default {
    data() {
        return {
            dayjs,
            accountsList: [],
        }
    },
    methods: {

        formatDate(date) {
            return dayjs(date).format('DD/MM/YYYY');
        },

        async viewAccounts() {
            const getAccounts = await this.$axios.get('/user-accounts');
            const accounts = getAccounts.data;
            this.accountsList = accounts;
        },
        async updateStatus(id, isActive) {
            const payload = {
                active: isActive
            }
            const resp = await this.$axios.patch(`/admin/status/${id}/`, payload);
            if (resp.status === 204) {
                console.log('status is updated !')
                this.accountsList[id - 1].active = !this.accountsList[id - 1].active
            } else {
                console.error("this is an error : " + resp)
            }
        }
    },
    mounted() {
        this.viewAccounts();
    }
}
</script>

<template>
    <div class="my-5 pt5">
        <div class="table-responsive my-5">
            <table id="accountslist" class="table table-bordered">
                <thead class="head-table">
                    <tr>
                        <th scope="col">Internal identifier</th>
                        <th scope="col">Internal email</th>
                        <th scope="col">Password</th>
                        <th scope="col">Creation date</th>
                        <th scope="col">Status</th>
                    </tr>
                </thead>
                <tbody id="accountsList" v-for="account in accountsList">
                    <tr>
                        <td class="text-truncate">{{ account.internalIdentifier }}</td>
                        <td class="text-truncate">{{ account.internalEmail }}</td>
                        <td class="text-truncate">{{ account.password }}</td>
                        <td class="text-center">{{ formatDate(account.createdAt) }}
                        </td>
                        <td class="text-center" @click="updateStatus(account.id, account.active)">
                            <a v-if="account.active" class="bi bi-circle-fill text-success" href="#"></a>
                            <a v-else class="bi bi-circle-fill text-danger" href="#"></a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>
<style scoped></style>