# Copyright (c) 2024 Wind River Systems, Inc.
+SUMMARY = "AV, Graphics, Events, and much more"
+DESCRIPTION = "\
+    Gazebo Common, a component of Gazebo, provides a set of libraries that cover many different use cases. \
+    An audio-visual library supports processing audio and video files, a graphics library can load a variety \
+    3D mesh file formats into a generic in-memory representation, \
+    and the core library of Gazebo Common contains functionality that spans Base64 encoding/decoding to thread pools.\
+    "
+HOMEPAGE = "https://gazebosim.org"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a461be67a1edf991251f85f3aadd1d0 \
                    file://profiler/src/Remotery/LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

SRC_URI = "git://github.com/gazebosim/gz-common.git;protocol=https;branch=gz-common6"

SRCREV = "338e73441841de6e387b619859e4e185e7c5fc2f"

S = "${WORKDIR}/git"

inherit cmake pkgconfig

# CMake Error: TRY_RUN() invoked in cross-compiling mode, please set the following cache variables appropriately:
#    FREEIMAGE_RUNS (advanced)
#    FREEIMAGE_RUNS__TRYRUN_OUTPUT (advanced)
EXTRA_OECMAKE += "-DFREEIMAGE_RUNS=1 -DFREEIMAGE_RUNS__TRYRUN_OUTPUT=0"

DEPENDS = "\
    assimp \
    cppcheck-native \
    doxygen-native \
    ffmpeg \
    freeimage \
    gdal \
    graphviz-native \
    gts \
    gz-cmake4 \
    gz-math8 \
    gz-utils3 \
    libtinyxml2 \
    util-linux \
"

FILES:${PN} += "\
    ${datadir}/gz/gz-common6/profiler_vis/* \
"

BBCLASSEXTEND = "native nativesdk"
