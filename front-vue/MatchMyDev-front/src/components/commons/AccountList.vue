<script>
import { resolveComponent } from 'vue';


export default {
    async mounted() {
        this.inputs = await this.get();
    },
    data() {
        return {
            inputs: []
        }
    },
    methods: {
        async get() {
            const response = await this.$axios.get('/useraccount');
            return response.data;
        }
    }
}
</script>

<template>
    <div class="container-xl my-5 pt-5">
        <h1>Accounts list</h1>
        <div class="table-responsive my-5">
            <table id="accountslist" class="table table-bordered table-striped">
                <thead class="head-table">
                    <tr>
                        <th scope="col">Internal identifier</th>
                        <th scope="col">Internal email</th>
                        <th scope="col">Password</th>
                        <th scope="col">Creation date</th>
                        <th scope="col">Status</th>
                    </tr>
                </thead>
                <tbody id="accountsList">
                    <tr v-for="element in this.inputs">
                        <td class="text-truncate"> {{ element.internalIdentifier }}</td>
                        <td class="text-truncate"> {{ element.internalEmail }}</td>
                        <td class="text-truncate" title="element.password"> {{ element.password }}</td>
                        <td class="text-truncate"> {{ element.createdAt }} </td>
                        <!-- <td class="text-center">
                            <a href="#/accounts-list"><i class="bi bi-circle-fill text-${element.active ? " success"
                                    : "danger" }"></i></a>
                        </td> -->
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>