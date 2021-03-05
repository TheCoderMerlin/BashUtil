#!/bin/bash
set -eu
ipRange=$1  # Example: 45.72.0.0/17
now=$(date +%F)
sudo ufw route insert 1 reject from $ipRange to any comment "MANUAL BAN WIKI since $now"
