<template>
  <f7-page>
    <f7-navbar title="Awesome Lists" back-link="Back"></f7-navbar>
    <f7-block-title>Awesome Lists</f7-block-title>
    <f7-block strong>
      <div class="markdown-body">

        <h2>Some cool shortcuts </h2>
    
        <ul>
          <li>
              <code>systemctl status jenkins.service</code>
          </li>
        </ul> 

      <h2>Good references:</h2>

      <ul>
        <li>
          <a href="#">Pipelines</a>
        </li>
      </ul> 

    </div>
    </f7-block>
  </f7-page>
</template>
<script>
import { f7Page, f7Navbar, f7BlockTitle, f7Block } from "framework7-vue";
import List from "../../../config/data/list.json";

export default {
  components: {
    f7Page,
    f7Navbar,
    f7BlockTitle,
    f7Block,
  },
  data() {
    const about = List.about;
    return {
      about
    };
  }
};
</script>
