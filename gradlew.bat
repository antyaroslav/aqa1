@rem ==============================================
@rem Gradle start up script for Windows
@rem ==============================================

@if "%DEBUG%" == "" @echo off
set DIRNAME=%~dp0

if defined JAVA_HOME goto findJavaFromJavaHome
set JAVA_EXE=java.exe
goto execute

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

:execute
"%JAVA_EXE%" -classpath "%DIRNAME%\gradle\wrapper" org.gradle.wrapper.GradleWrapperMain %*
exit /B %ERRORLEVEL%