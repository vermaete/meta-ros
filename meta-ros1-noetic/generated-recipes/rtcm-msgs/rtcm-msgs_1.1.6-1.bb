# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The rtcm_msgs package contains messages related to data in the RTCM format."
AUTHOR = "Marek Materzok <tilk@tilk.eu>"
ROS_AUTHOR = "Marek Materzok <tilk@tilk.eu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rtcm_msgs"
ROS_BPN = "rtcm_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    ros-environment \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/nobleo/rtcm_msgs-release/archive/release/noetic/rtcm_msgs/1.1.6-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rtcm_msgs"
SRC_URI = "git://github.com/nobleo/rtcm_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "080e7bf0bb84f6396cce315353818e38bc5f0fbd"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
