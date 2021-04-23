#!/bin/bash
#
# 0. Environment MUST be loaded with 'bbenv'
# 2. Sets credentials for b2
#

set -eu

B2_APPLICATION_KEY_ID=$DOCKER_com_backblaze_key_id
B2_APPLICATION_KEY=$DOCKER_com_backblaze_application_key
commandLine="b2 $@"
eval "$commandLine"

