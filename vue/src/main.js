import Vue from 'vue'
import App from './components/Home'
import router from './router'
import axios from 'axios'
import vuex from 'vuex'
import {store} from './store'


Vue.config.productionTip = false
Vue.prototype.$http = axios

new Vue({
  render: h => h(App),
  router,
  axios,
  vuex,
  store
}).$mount('#app')
