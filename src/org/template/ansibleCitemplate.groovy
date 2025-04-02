package org.template

import org.ansibleCI.*
import org.common.*

def call (String branch_name, String repo_url, String git_password, String taskFile_path, String playbook_path, String inventory_path, String key_path, String user_name) {

  clone = new gitclone()
  yamllint = new yamlLint()
  ansiblelint = new ansibleLint()
  securitycheck = new securityCheck()
  dryrun = new dryRun()

  clone.call(branch_name, repo_url, git_password)
  yamllint.call(taskFile_path)
  ansiblelint.call(taskFile_path)
  securitycheck.call(taskFile_path)
  dryrun.call(inventory_path, playbook_path, key_path, user_name)
  
}
