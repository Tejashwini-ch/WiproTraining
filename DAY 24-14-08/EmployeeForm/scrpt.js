document.addEventListener("DOMContentLoaded", function () {
    document.getElementById("employeeForm").addEventListener("submit", function (e) {
        e.preventDefault();

        let empId = document.getElementById("empId").value.trim();
        let empName = document.getElementById("empName").value.trim();
        let email = document.getElementById("empEmail").value.trim();
        let dob = document.getElementById("empDob").value;
        let address = document.getElementById("empAddress").value.trim();
        let mobile = document.getElementById("empMobile").value.trim();

        // Log in console
        console.log("Employee ID:", empId);
        console.log("Employee Name:", empName);
        console.log("Email:", email);
        console.log("DOB:", dob);
        console.log("Address:", address);
        console.log("Mobile No:", mobile);

        // Display on screen
        document.getElementById("output").innerHTML = `
            Employee ID: ${empId} <br>
            Employee Name: ${empName} <br>
            Email: ${email} <br>
            DOB: ${dob} <br>
            Address: ${address} <br>
            Mobile No: ${mobile}
        `;

        // Show alert
        alert(`Details Retrieved:
Employee ID: ${empId}
Name: ${empName}
Email: ${email}
DOB: ${dob}
Address: ${address}
Mobile: ${mobile}`);
    });
});
