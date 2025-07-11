# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Metapackage for Cartesian ROS controllers"
AUTHOR = "Felix Exner <exner@fzi.de>"
HOMEPAGE = "http://wiki.ros.org/ros_controllers_cartesian"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "ros_controllers_cartesian"
ROS_BPN = "ros_controllers_cartesian"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cartesian-interface \
    cartesian-trajectory-controller \
    cartesian-trajectory-interpolation \
    twist-controller \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UniversalRobots/Universal_Robots_ROS_controllers_cartesian-release/archive/release/noetic/ros_controllers_cartesian/0.1.7-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/ros_controllers_cartesian"
SRC_URI = "git://github.com/UniversalRobots/Universal_Robots_ROS_controllers_cartesian-release;${ROS_BRANCH};protocol=https"
SRCREV = "7a577e3381897777f128be13dd2844a9ed971d06"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
