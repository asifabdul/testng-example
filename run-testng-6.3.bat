@echo off
set OUT_DIR=out\production\inheritance
rem set JAVA_HOME=D:\Apps\Java\jdk1.6.0_20
set TESTNG_XML=all.xml
set REPORT_DIR=test-reports
set CLASSPATH=%OUT_DIR%
set CLASSPATH=%CLASSPATH%;dist\lib\others\*
set CLASSPATH=%CLASSPATH%;dist\lib\testng-6.3.1\*

rem remove existing report directory
IF EXIST %REPORT_DIR% (
    @echo on
    echo Report directory %REPORT_DIR% exists. Going to remove the existing directory
    rmdir /S %REPORT_DIR%
    @echo off
)
@echo on
%JAVA_HOME%\bin\java -classpath %CLASSPATH% org.testng.TestNG %TESTNG_XML% -d %REPORT_DIR%
