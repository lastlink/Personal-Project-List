import HomePage from './pages/home.vue';
import AboutPage from './pages/about.vue';
import FormPage from './pages/form.vue';
import DynamicRoutePage from './pages/dynamic-route.vue';
import NotFoundPage from './pages/not-found.vue';

// import PanelLeftPage from './pages/panel-left.vue';

import PanelLeftPage from './pages/projects/panel-left.vue';
import PanelRightPage from './pages/panel-right.vue';

import Home from './pages/projects/home.vue';
import About from './pages/projects/about.vue';
import GamesList from './pages/projects/games-list.vue';
import HomeList from './pages/projects/home-list.vue';
import LiveList from './pages/projects/live-list.vue';
import GithubList from './pages/projects/github-list.vue';
import ColorThemes from './pages/color-themes.vue';

import RoutableModals from './pages/routable-modals.vue';
import RoutablePopup from './pages/routable-popup.vue';
import RoutableActions from './pages/routable-actions.vue';

export default [
  // {
  //   path: '/',
  //   component: HomePage,
  // },
  {
    path: '/',
    component: Home,
  },
  {
    path: '/about/',
    component: About,
  },
  {
    path: '/home-list/',
    component: HomeList,
  },
  {
    path: '/live-list/',
    component: LiveList,
  },
  {
    path: '/github-list/',
    component: GithubList,
  },
  {
    path: '/games-list/',
    component: GamesList,
  },
  // Routable Modals
  {
    path: '/routable-modals/',
    component: RoutableModals,
    routes: [
      {
        path: 'popup/',
        popup: {
          component: RoutablePopup,
        },
      },
      {
        path: 'actions/',
        popup: {
          component: RoutableActions,
        },
      },
    ],
  },
  {
    path: '/color-themes/',
    component: ColorThemes,
  },
  {
    path: '/panel-left/',
    component: PanelLeftPage,
  },
  {
    path: '/panel-right/',
    component: PanelRightPage,
  },
  {
    path: '/about/',
    component: AboutPage,
  },
  {
    path: '/form/',
    component: FormPage,
  },
  {
    path: '/dynamic-route/blog/:blogId/post/:postId/',
    component: DynamicRoutePage,
  },
  {
    path: '(.*)',
    component: NotFoundPage,
  },
];
