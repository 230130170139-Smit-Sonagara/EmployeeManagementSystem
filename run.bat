@echo off
echo ========================================================
echo   Compiling Employee Management System Java Files...
echo ========================================================
javac Employee.java EmployeeApp.java
if %errorlevel% neq 0 (
    echo [ERROR] Compilation failed!
    pause
    exit /b %errorlevel%
)
echo [SUCCESS] Compilation successful.
echo.
echo Starting Employee Management System...
echo ========================================================
java EmployeeApp
pause
