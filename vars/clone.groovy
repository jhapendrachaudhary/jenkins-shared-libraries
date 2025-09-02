def clone(string gitUrl, string gitBranch){
git branch: "${gitBranch}" , url: "${gitUrl}"
  echo "Successfully cloned"
}
