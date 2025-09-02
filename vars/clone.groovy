def clone(String gitUrl, String gitBranch){
git branch: "${gitBranch}" , url: "${gitUrl}"
  echo "Successfully cloned"
}
