<template>
  <f7-page>
    <f7-navbar title="About Project List" back-link="Back"></f7-navbar>
    <f7-block-title>Welcome to Project List</f7-block-title>
    <f7-block strong>
      <p>{{about}}</p>
    </f7-block>
  </f7-page>
</template>
<script>
  import { f7Page, f7Navbar, f7BlockTitle, f7Block } from 'framework7-vue';
  import List from '../../../config/data/list.json'


  export default {
    components: {
      f7Page,
      f7Navbar,
      f7BlockTitle,
      f7Block,
    },
    data(){
      const about = List.about;
      return{
        about
      }
    }
  };
</script>
