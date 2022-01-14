import { createRouter, createWebHistory } from "vue-router";
import AboutChuck from "../views/AboutChuck.vue";

const routes = [
  {
    path: "/",
    name: "AboutChuck",
    component: AboutChuck,
  },
  //  TODO: Implementieren Sie hier die Route zu /about-me
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
