@echo off

if "%1"=="" goto :SemArgumento

copy Modelo.java %1.java > nul
powershell -Command "& {(Get-Content %1.java) -replace 'Modelo', '%1' | Set-Content %1.java}"

echo Programa %1 criado com sucesso!
goto :FimScript

:SemArgumento
echo Uso: cria.bat <NomeDoPrograma>

:FimScript