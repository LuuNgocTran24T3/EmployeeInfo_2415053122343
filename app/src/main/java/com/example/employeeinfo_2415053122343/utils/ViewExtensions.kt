package com.example.employeeinfo_2415053122343.utils

import com.example.employeeinfo_2415053122343.model.Employee

fun Employee.getSalaryStatus(standardSalary: Double): String{
    return when {
        salary > standardSalary -> "Cao hơn lương chuẩn"
        salary < standardSalary -> "Thấp hơn lương chuẩn"
        else -> "Bằng lương chuẩn"
    }
}
fun Employee.getUpperCaseName(): String{
    return fullName.uppercase()
}
fun Employee.getSeniorityRank(): String{
    return when {
        seniority < 2 -> "Nhân viên mới"
        seniority in 2..4 -> "Nhân viên có kinh nghiệm"
        seniority in 5..9 -> "Nhân viên lâu năm"
        else -> "Nhân viên kỳ cựu"
    }
}