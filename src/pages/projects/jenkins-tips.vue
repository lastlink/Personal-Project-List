<template>
  <f7-page>
    <f7-navbar title="Jenkins Tips" back-link="Back"></f7-navbar>
    <f7-block-title>Jenkins Tips</f7-block-title>
    <f7-block strong>
      <div class="markdown-body">

        <h2>Some cool shortcuts </h2>
    
        <ul>
          <li>
              <code>systemctl status jenkins.service</code>
          </li>
          <li>
              <code>systemctl start jenkins.service</code> 
          </li>
          <li>
              <code>systemctl stop jenkins.service</code> 
          </li>
          <li>
              <code>service jenkins restart</code> 
          </li>
          <li>
             Using rsync to deploy <br>
              <code>rsync -rvu --delete $JENKINS_HOME/workspace/jobname/buildpath/ /var/www/html/webpagelocation</code> 
          </li>
                    

        </ul> 
      <h2>Config location on debian:</h2>

      <ul>
        <li>
          For changing server configurations like memory: <code>/etc/default/jenkins</code> 
        </li>
         <li>
          Location of workspaces, builds, files: <code>/var/lib/jenkins</code> 
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
