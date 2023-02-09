<script>

export default {
    data() {
        return {
            accountsList: [],
        }
    },
    methods: {

        async viewAccounts() {
            const getAccounts = await this.$axios.get('/user-accounts');
            const accounts = getAccounts.data;
            this.accountsList = accounts;
            if (test) {
                console.log("yeah");
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
                        <td class="text-truncate">{{ account.createdAt }}</td>
                        <td class="text-center">
                            <a v-if="account.active" class="bi bi-circle-fill text-succes"></a>
                            <a v-else class="bi bi-circle-fill text-danger"></a>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>
<style scoped>

</style>