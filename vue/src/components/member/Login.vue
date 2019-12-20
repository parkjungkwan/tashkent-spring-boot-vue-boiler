<template>
    <div class="login-form">
    <form action="/examples/actions/confirmation.php" method="post">
        <h2 class="text-center">Log in</h2>       
        <div class="form-group">
            <input v-model="userid" type="text" class="form-control" placeholder="Username" required="required">
        </div>
        <div class="form-group">
            <input v-model="passwd" type="password" class="form-control" placeholder="Password" required="required">
        </div>
        <div class="form-group">
            <button @click="login" type="submit" class="btn btn-primary btn-block">Log in</button>
        </div>
        <div class="clearfix">
            <label class="pull-left checkbox-inline"><input type="checkbox"> Remember me</label>
            <a href="#" class="pull-right">Forgot Password?</a>
        </div>        
    </form>
    <p class="text-center"><a href="#">Create an Account</a></p>
</div>
</template>
<script>
import axios from "axios"
export default {
    data () {
       return {
           context: 'http://localhost:8080/',
           result: '',
           userid:'',
           passwd:''
       }
    },
    methods : {
        login(){
          alert(`${this.userid} ,  ${this.passwd}`)
          let url = `${this.context}/login`
          let data = {
              userid: this.userid,
              passwd: this.passwd
          }
          let headers = {
              'authorization': 'JWT fefege..',
              'Accept' : 'application/json',
              'Content-Type': 'application/json'
          }
          axios
          .post(url, data, headers)
          .then(res=>{
              this.result = res.data
              alert(`로그인성공 ${this.result.userid}`)
          })
          .catch(()=>{
              alert('AXIOS 실패')
          })  
        }
    }
}
</script>
<style scoped>
.login-form {
    width: 340px;
    margin: 50px auto;
}
.login-form form {
    margin-bottom: 15px;
    background: #f7f7f7;
    box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
    padding: 30px;
}
.login-form h2 {
    margin: 0 0 15px;
}
.form-control, .btn {
    min-height: 38px;
    border-radius: 2px;
}
.btn {        
    font-size: 15px;
    font-weight: bold;
}
</style>