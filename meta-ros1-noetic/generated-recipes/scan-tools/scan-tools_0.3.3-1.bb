# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Laser scan processing tools."
AUTHOR = "Carlos <cjaramillo@gc.cuny.edu>"
ROS_AUTHOR = "Ivan Dryanovski <ccnyroboticslab@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/scan_tools"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD & LGPLv3"
LICENSE = "BSD & LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "scan_tools"
ROS_BPN = "scan_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    laser-ortho-projector \
    laser-scan-matcher \
    laser-scan-sparsifier \
    laser-scan-splitter \
    ncd-parser \
    polar-scan-matcher \
    scan-to-cloud-converter \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    laser-ortho-projector \
    laser-scan-matcher \
    laser-scan-sparsifier \
    laser-scan-splitter \
    ncd-parser \
    polar-scan-matcher \
    scan-to-cloud-converter \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/scan_tools-release/archive/release/noetic/scan_tools/0.3.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/scan_tools"
SRC_URI = "git://github.com/ros-gbp/scan_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "6a5d5d463a3e6f1914541556882922e94d203c3c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
