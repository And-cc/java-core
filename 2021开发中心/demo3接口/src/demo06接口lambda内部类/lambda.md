## 6.2lambda表达式
### 6.2.1为什么引入lambda表达式 
> lambda表达式是一个可传递的代码块，可以在以后执行一次或多次（Java函数式编程）
>
>> Lambda 表达式 − Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中)[参考自](https://blog.csdn.net/majianxin1/article/details/102604000?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162252327916780262596868%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=162252327916780262596868&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-102604000.first_rank_v2_pc_rank_v29&utm_term=javalambda%E8%A1%A8%E8%BE%BE%E5%BC%8F&spm=1018.2226.3001.4187)

### 6.2.2lambda表达式语法
> >(参数)->{表达式}
>
>  1.当参数唯一且知道参数类型可省略(),如果代码能推导参数类型则无需声明参数类型(String name,String password),没有参数要有()
>
>  2.如果能用一个表达式完成计算则无需{},否则加上{}
>
>  3.无需指定lambda返回类型，因为他能自己推导

### 6.2.3函数式接口 [参考自](https://blog.csdn.net/lz710117239/article/details/76192629?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522162254017016780262585275%2522%252C%2522scm%2522%253A%252220140713.130102334..%2522%257D&request_id=162254017016780262585275&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~sobaiduend~default-2-76192629.first_rank_v2_pc_rank_v29&utm_term=java%E5%87%BD%E6%95%B0%E5%BC%8F%E6%8E%A5%E5%8F%A3&spm=1018.2226.3001.4187)
