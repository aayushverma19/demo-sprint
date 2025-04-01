package database.template

import database.common.*
import database.postgresql.*

  def call (String branch , String repoUrl, String gitPassword, String inventory_path, String playbook_path, String key_path) {

    clone =  new gitclone()
    deployDB = new deploy()

    clone.cloneRepo(branch, repoUrl, gitPassword)
    deploydb(inventory_path, playbook_path, key_path)

  }
