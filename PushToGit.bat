@echo off
git init
set satatement=git remote add origin 
set /p input=Enter your Github link 
echo %statement%input%
git branch -M main
git add .
git commit -m "Push to git"
git push -f origin main
echo Bye
pause
exit