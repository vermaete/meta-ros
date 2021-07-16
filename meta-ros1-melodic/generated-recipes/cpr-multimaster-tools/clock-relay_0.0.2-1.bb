# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Specialization of message_relay for clock"
AUTHOR = "Paul Bovbel <pbovbel@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cpr_multimaster_tools"
ROS_BPN = "clock_relay"

ROS_BUILD_DEPENDS = " \
    message-relay \
    roscpp \
    rosgraph-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-relay \
    roscpp \
    rosgraph-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-relay \
    roscpp \
    rosgraph-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/cpr_multimaster_tools-release/archive/release/melodic/clock_relay/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/clock_relay"
SRC_URI = "git://github.com/clearpath-gbp/cpr_multimaster_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "08e3d36be6d474353f84fc7a8e3eb35854345555"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
