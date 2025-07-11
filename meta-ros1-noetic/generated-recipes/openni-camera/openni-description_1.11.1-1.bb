# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Model files of OpenNI device."
AUTHOR = "Isaac I.Y. Saito <130s@2000.jukuin.keio.ac.jp>"
ROS_AUTHOR = "Isaac I.Y. Saito <isaac.saito@plusonerobotics.com>"
HOMEPAGE = "http://www.ros.org/wiki/openni_description"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "openni_camera"
ROS_BPN = "openni_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    urdfdom \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/openni_camera-release/archive/release/noetic/openni_description/1.11.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/openni_description"
SRC_URI = "git://github.com/ros-gbp/openni_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "d97cf77768495e1c314ba7a8f68ba91c6e30856d"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
