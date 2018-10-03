<template>
  <f7-page>
    <f7-navbar title="Pi/Linux Tips" back-link="Back"></f7-navbar>
    <f7-block-title>Pi/Linux Tips</f7-block-title>
    <f7-block strong>
      <div class="markdown-body">

        <h2>Some cool shortcuts </h2>
    
        <ul>
          <li>
            Update Pihole: <code>pihole -up update</code> 
          </li>
          <li>
              <code>sudo service pihole-FTL restart</code>
          </li>
           <li>
              <code>service nginx start</code> 
          </li>
          <li>
              Restart machine<code>reboot</code>
          </li>
          <li>
              Change to root user if current user has sudo permissions: <code>sudo su</code>
          </li>
          <li>
              <code>/etc/init.d/lighttpd restart</code>
          </li>
          <li>
              <code>service nginx start</code> 
          </li>
          <li>
              Show drives on linux <code>fdisk -l</code> 
          </li>
          <li>
              Unzip tar file using nice priority: <code>nice -n15 tar -xvzf tarfile.tar.gz</code>
          </li>
          
          <!-- <li>
              <pre><code></code></pre> Add user
          </li> -->
          <li>
              Change user: <code>su username</code>  
          </li>
        </ul> 

      <h2>Good references:</h2>

      <ul>
        <li><a href="https://computers.tutsplus.com/articles/how-to-clone-raspberry-pi-sd-cards-using-the-command-line-in-os-x--mac-59911">Backup pi sd card on mac using terminal</a>
        </li>
        <li>
          <a href="https://variax.wordpress.com/2017/03/18/adding-https-to-the-raspberry-pi-apache-web-server/comment-page-1/">setup local certs</a>
        </li>
        <li>
          <a href="https://discourse.pi-hole.net/t/enabling-https-for-your-pi-hole-web-interface/5771/24">enable ssl</a>
        </li>
        <li>
          <a href="https://sindresorhus.com/github-markdown-css/">Markdown css exmaple</a>
        </li>
      </ul>  
    <h2> Give priority to processes and attempt to throttle.</h2>

    <p>IMPORTANT use tool called <strong>nice</strong> <code>-n-20</code> Highest priority and
     <code>-n19</code> is lowest priority. Really important so other processes still open while doing simple things like unzipping and moving files around.
     Otherwise will bring all processes to a crawl... :(
    </p>

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
