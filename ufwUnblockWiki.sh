#!/bin/bash
set -eu
ipRange=$1  # Example: 45.72.0.0/17
ufw route delete reject from $ipRange to any
