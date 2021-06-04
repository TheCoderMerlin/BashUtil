#!/bin/bash
#
# 0. Environment MUST be loaded with 'bbenv'
# 2. Sets credentials for b2
#

set -eu

export B2_APPLICATION_KEY_ID=$DOCKER_com_backblaze_key_id
export B2_APPLICATION_KEY=$DOCKER_com_backblaze_application_key
commandLine="/usr/local/bin/b2 $@"
eval "$commandLine"
