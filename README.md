# EmployeeInfo_2415053122343

## 1. Thông tin sinh viên
* **MSSV:** 2415053122343
* **Họ tên:** Lưu Ngọc Trân
* **Lớp:** 24T3

## 2. Tên project

**EmployeeInfo_2415053122343**

## 3. Model

File:

`model/Employee.kt`

Model được xây dựng bằng Kotlin Data Class:

```kotlin
data class Employee(
    val employeeId: String,
    val fullName: String,
    val department: String,
    val age: Int,
    val salary: Double,
    val gender: String,
    val seniority: Int
)
```

## 4. Extension Function

File:

`utils/ViewExtensions.kt`

Extension Function chính:

```kotlin
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
```

## 5. Yêu cầu mở rộng

Hiển thị thông tin mức lương trên số chuẩn (đặt lương chuẩn và so sánh)
Hiển thị tên viết hoa.
Hiển thị mức xếp loại dựa trên thâm niên. (tự quy định mức)
