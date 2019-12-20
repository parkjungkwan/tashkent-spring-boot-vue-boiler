<template>
	<div id="app">
		<layout>
			<template #header="header">
				<h1>{{header.title}}</h1>
				<router-link to="/login">로그인</router-link>
				<router-link to="/join">회원가입</router-link>
			</template>
			<template #sidebar="sidebar">
				<ul class="menu">
					<li v-for="i of sidebars" :key="i.menu" >
						<router-link :to="i.link">{{i.menu}}</router-link>
					</li>
				</ul>
			</template>
			<template #content="content"><router-view/></template>
			<template #footer="footer">{{footer.title}}</template>
		</layout>
	</div>
</template>
<script>
import Layout from "@/components/cmm/Layout.vue"
export default{
	components : {Layout},
	data(){
		return {
			sidebars: [
				{menu:"글쓰기",link:"/write"},
				{menu:"목록",link:"/list"},
				{menu:"글수정",link:"/update"},
				{menu:"글삭제",link:"/remove"},
				{menu:"검색",link:"/search"},
			]
		}
	}
}
</script>
<style scoped>
ul.menu {
    position:relative;
    padding: 5px 5px 5px 5px;
    list-style: none;
    font-style: italic;
}
ul.menu a {
    text-decoration:none;
}
</style>