<template>
  <div id="nav">
    <router-link to="/">About Chuck</router-link> |
    <router-link to="/about">About Me</router-link>
  </div>
  <router-view />
</template>

<style>
html,
body {
  background-color: #f7f7f7;
  margin: 0;
  padding: 0;
  height: 100%;
}
#nav {
  padding: 30px;
  text-align: center;
}
#nav a {
  font-weight: bold;
  font-size: x-large;
  color: #2c3e50;
}
#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
