import Vue from 'vue'
import Router from 'vue-router'
import List from '@/components/board/List'
import Remove from '@/components/board/Remove'
import Search from '@/components/board/Search'
import Update from '@/components/board/Update'
import Write from '@/components/board/Write'
import Join from '@/components/member/Join'
import Login from '@/components/member/Login'
Vue.use(Router)


export default new Router({
	mode: 'history',
	routes : [
		{path: '/list',name: 'list', component: List},
		{path: '/remove',name: 'remove', component: Remove},
		{path: '/update',name: 'update', component: Update},
		{path: '/search',name: 'search', component: Search},
		{path: '/write',name: 'write', component: Write},
		{path: '/join',name: 'join', component: Join},
		{path: '/login',name: 'login', component: Login}
	]
})