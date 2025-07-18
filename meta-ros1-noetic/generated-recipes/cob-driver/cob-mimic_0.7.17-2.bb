# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package implements the Care-O-bot mimic"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Nadia Hammoudeh Garcia <nhg@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_mimic"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_mimic"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    message-generation \
    roscpp \
    roslib \
    vlc \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    roscpp \
    roslib \
    vlc \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    message-runtime \
    roscpp \
    roslib \
    rospy \
    vlc \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/4am-robotics/cob_driver-release/archive/release/noetic/cob_mimic/0.7.17-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_mimic"
SRC_URI = "git://github.com/4am-robotics/cob_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "f5c4413c3c10a5208a5735764215dcf68cf9b45d"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
