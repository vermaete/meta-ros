# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Example launch and configuration files for mrpt_sensors nodes"
AUTHOR = "José Luis Blanco-Claraco <joseluisblancoc@gmail.com>"
ROS_AUTHOR = "José Luis Blanco-Claraco"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_sensors"
ROS_BPN = "mrpt_sensors_examples"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mrpt-generic-sensor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/mrpt-ros-pkg-release/mrpt_sensors-release/archive/release/noetic/mrpt_sensors_examples/0.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/mrpt_sensors_examples"
SRC_URI = "git://github.com/mrpt-ros-pkg-release/mrpt_sensors-release;${ROS_BRANCH};protocol=https"
SRCREV = "e29fdc36596434c6c86800d3c47db76153f29f68"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
