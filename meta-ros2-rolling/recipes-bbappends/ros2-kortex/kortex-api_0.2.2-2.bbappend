# Copyright (c) 2023 Wind River Systems, Inc.

SRC_URI += "https://artifactory.kinovaapps.com:443/artifactory/generic-public/kortex/API/2.5.0/linux_x86-64_x86_gcc.zip;name=zip;subdir=git/kinova_binary_api" 
SRC_URI[zip.sha56sum] = "105da907c336ba322357a284898bcbd3bebe01dc222cef4f9549f3b69aedf160"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI += " \
  file://0001-use-bitbake-fetcher.patch \
  file://0002-install-libraries.patch \
"

COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE:x86-64 = "(.*)"
COMPATIBLE_MACHINE:x86 = "(^$)"
COMPATIBLE_MACHINE:aarch64 = "(^$)"
COMPATIBLE_MACHINE:armv7a = "(^$)"
COMPATIBLE_MACHINE:armv7ve = "(^$)"
