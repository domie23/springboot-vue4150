const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootoqf8h/",
            name: "springbootoqf8h",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootoqf8h/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "藏区特产销售平台"
        } 
    }
}
export default base
