<template>
  <f7-page>
    <f7-navbar title="Github List" back-link="Back">
      <f7-subnavbar :inner="false">
        <f7-searchbar
          search-container=".virtual-list"
          search-item="li"
          search-in=".item-title"
        ></f7-searchbar>
      </f7-subnavbar>
    </f7-navbar>
    <f7-block>
      <p>{{List.github_list.description}}</p>
    </f7-block>
    <f7-list class="searchbar-not-found">
      <f7-list-item title="Nothing found"></f7-list-item>
    </f7-list>
    <f7-list
      class="searchbar-found"
      medial-list
      virtual-list
      :virtual-list-params="{ items, searchAll, renderExternal, height: $theme.ios ? 63 : 73}"
    >
      <ul>
          <li v-for="(item, index) in vlData.items" class="media-item" :style="`top: ${vlData.topPosition}px`" :key="index">
 <!-- class="item-link" -->
          <a :href="item.link" class="link external" target="_blank">
          <div class="item-content">
            <div class="item-media">
              <img :src="item.iconUrl" height="40px">
            </div>
            <div class="item-inner">
              <div class="item-title-row">
                <div class="item-title">{{item.title}}:</div>
                </div>
                <div class="item-subtitle">{{item.subtitle}}</div>
              </div>
            </div>
          </a>
        </li>
      </ul>
    </f7-list>
  </f7-page>
</template>
<script>
  import { f7Navbar, f7Page, f7List, f7ListItem, f7Subnavbar, f7Searchbar, f7Block } from 'framework7-vue';
  import List from '../../../config/data/list.json'

  export default {
    components: {
      f7Navbar, f7Page, f7List, f7ListItem, f7Subnavbar, f7Searchbar, f7Block,
    },
    data() {
      const items = [];
      for (let i = 0; i < List.github_list.list.length; i++) {
        items.push(List.github_list.list[i])
      }
      return {
        List,
        items,
        vlData: {
          items: [],
        },
      };
    },
    methods: {
      searchAll(query, items) {
        const found = [];
        for (let i = 0; i < items.length; i += 1) {
          if (items[i].title.toLowerCase().indexOf(query.toLowerCase()) >= 0 || query.trim() === '') found.push(i);
        }
        return found; // return array with mathced indexes
      },
      renderExternal(vl, vlData) {
        this.vlData = vlData;
      },
    },
  };
</script>
