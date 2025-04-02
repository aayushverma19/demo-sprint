package database.template

import database.common.*
import database.postgresql.*

  
  def call (String credentials_Id , String version, String user_name, String inventory_path, String playbook_path, String key_path) {

    clone =  new gitclone()
    deployDB = new deploy()

    clone.cloneRepo(credentials_Id, version, user_name)
    //deploydb.ancibleExecute(inventory_path, playbook_path, key_path)

  }
