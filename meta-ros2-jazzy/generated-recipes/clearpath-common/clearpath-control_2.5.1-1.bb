# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Controllers for Clearpath Robotics platforms"
AUTHOR = "Luis Camero <lcamero@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "clearpath_common"
ROS_BPN = "clearpath_control"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    clearpath-bt-joy \
    controller-manager \
    diff-drive-controller \
    imu-filter-madgwick \
    interactive-marker-twist-server \
    joint-state-broadcaster \
    joint-trajectory-controller \
    joy-linux \
    mecanum-drive-controller \
    robot-localization \
    robot-state-publisher \
    teleop-twist-joy \
    twist-mux \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/clearpath_common-release/archive/release/jazzy/clearpath_control/2.5.1-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/clearpath_control"
SRC_URI = "git://github.com/clearpath-gbp/clearpath_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "6d2e99fa39a7611a3ef1dadc87220e12fccec338"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
