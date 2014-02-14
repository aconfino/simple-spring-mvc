cp target/SpringMVC.war C:/workspace/openshift-sample-app/jbossews/webapps/ROOT.war
cd C:/workspace/openshift-sample-app/jbossews/webapps/
git add .
git commit -m "update"
git push

branch to push: master
target remote name: origin

git push -u ssh://52fd800f5004469e44000011@jbossews-darthvadar.rhcloud.com/~/git/jbossews.git master:origin