echo "DEPLOYING TO TOMCAT..."

# set paths
$currentAbsPath = (Get-Item .).FullName
$tomcat = $Env:TOMCAT_HOME
# $tomcat_bin =  Join-Path -Path $tomcat -ChildPath "bin"
$tomcat_bin =  "${tomcat}\bin"
$tomcat_apps = "${tomcat}\webapps"
$tomcat_start_server = "${tomcat_bin}\startup.bat"
$port = 8080
$portData = netstat -ano | findstr :$port

# echo "ROOT ${PSScriptRoot}"
# echo "ABS ${currentAbsPath}"
# echo "server ${tomcat_start_server}"
# echo "portData ${portData}"

# close tomcat server if open
if ($portData) {
    echo "SHUTTING DOWN SERVER..."
    $tomcat_pid = $portData[1] -replace "[^0-9]","" -replace "80800",""
    echo $tomcat_pid
    taskkill /pid $tomcat_pid /f
}

#  copy war file to server
Copy-Item "./target/rest.war" -Destination $tomcat_apps

# launch new server
echo "LAUNCHING SERVER..."

# $start_server_process = @{ FilePath = $tomcat_start_server }
# Start-Process @start_server_process

push-location $tomcat_bin
start-process startup.bat
pop-location

echo "DEPLOY SUCCESSFUL !"
