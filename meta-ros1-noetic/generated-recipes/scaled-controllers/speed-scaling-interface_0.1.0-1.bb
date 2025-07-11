# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Hardware interface reading a scalar value from robot hardware."
AUTHOR = "Felix Exner <exner@fzi.de>"
ROS_AUTHOR = "Felix Exner <exner@fzi.de>"
HOMEPAGE = "http://wiki.ros.org/speed_scaling_interface"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "scaled_controllers"
ROS_BPN = "speed_scaling_interface"

ROS_BUILD_DEPENDS = " \
    hardware-interface \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    hardware-interface \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UniversalRobots/Universal_Robots_ROS_scaled_controllers-release/archive/release/noetic/speed_scaling_interface/0.1.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/speed_scaling_interface"
SRC_URI = "git://github.com/UniversalRobots/Universal_Robots_ROS_scaled_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "3ef9c93e31ca1372d5bebd8c80443dc89e731362"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
