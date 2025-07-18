# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A Gazebo-based simulation environment for the Schunk SVH"
AUTHOR = "Stefan Scherzinger <scherzin@fzi.de>"
ROS_AUTHOR = "Stefan Scherzinger <scherzin@fzi.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=5f660bce20dfd88ba2749c28f85619d4"

ROS_CN = "schunk_svh_ros_driver"
ROS_BPN = "schunk_svh_simulation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    schunk-svh-description \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SCHUNK-GmbH-Co-KG/schunk_svh_ros_driver-release/archive/release/noetic/schunk_svh_simulation/0.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/schunk_svh_simulation"
SRC_URI = "git://github.com/SCHUNK-GmbH-Co-KG/schunk_svh_ros_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "48fd121e6dac11d2b7d8c32b67d3eb5469e5c566"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
