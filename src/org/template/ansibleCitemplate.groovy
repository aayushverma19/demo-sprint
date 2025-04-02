package org.template

import org.ansibleCI.*
import org.common.*

def call (String branch_name, String repo_url, String git_password, String playbook_path, String inventory_path, String key_path, String user_name) {

  clone = new gitclone()
  yamllint = new yamllint()
  ansiblelint = new ansiblelint()
  securitycheck = new securityCheck()
  dryrun = new dryRun()

  clone.call(branch_name, repo_url, git_password)
  yamllint.call(playbook_path)
  ansiblelint.call(playbook_path)
  securitycheck.call(playbook_path)
  dryrun.call(inventory_path, playbook_path, key_path, user_name)
  
}
