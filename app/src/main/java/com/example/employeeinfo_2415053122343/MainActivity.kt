package com.example.employeeinfo_2415053122343

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.employeeinfo_2415053122343.model.Employee
import com.example.employeeinfo_2415053122343.utils.getSalaryStatus
import com.example.employeeinfo_2415053122343.utils.getSeniorityRank
import com.example.employeeinfo_2415053122343.utils.getUpperCaseName
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        // Tạo đối tượng Employee từ Model
        val employee = Employee(
            employeeId = "2415053122343",
            fullName = "Lưu Ngọc Trân",
            department = "IT",
            age = 20,
            salary = 15_000_000.0,
            gender = "Nữ",
            seniority = 2
        )

        // Lương chuẩn
        val standardSalary = 12_000_000.0

        // Định dạng tiền Việt Nam
        val formatter = NumberFormat.getNumberInstance(Locale("vi", "VN"))

        val tvEmployeeId = findViewById<TextView>(R.id.tvEmployeeId)
        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvDepartment = findViewById<TextView>(R.id.tvDepartment)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvSalary = findViewById<TextView>(R.id.tvSalary)
        val tvGender = findViewById<TextView>(R.id.tvGender)
        val tvSeniority = findViewById<TextView>(R.id.tvSeniority)

        val tvUpperName = findViewById<TextView>(R.id.tvUpperName)
        val tvSalaryStatus = findViewById<TextView>(R.id.tvSalaryStatus)
        val tvSeniorityRank = findViewById<TextView>(R.id.tvSeniorityRank)

        tvEmployeeId.text = "Mã nhân viên: ${employee.employeeId}"
        tvFullName.text = "Họ tên: ${employee.fullName}"
        tvDepartment.text = "Phòng ban: ${employee.department}"
        tvAge.text = "Tuổi: ${employee.age}"
        tvSalary.text = "Lương: ${formatter.format(employee.salary)} VNĐ"
        tvGender.text = "Giới tính: ${employee.gender}"
        tvSeniority.text = "Thâm niên: ${employee.seniority} năm"

        // Sử dụng Extension Function
        tvUpperName.text =
            "Họ tên viết hoa: ${employee.getUpperCaseName()}"
        tvSalaryStatus.text =
            "So với lương chuẩn: ${employee.getSalaryStatus(standardSalary)}"
        tvSeniorityRank.text =
            "Xếp loại thâm niên: ${employee.getSeniorityRank()}"
    }
}