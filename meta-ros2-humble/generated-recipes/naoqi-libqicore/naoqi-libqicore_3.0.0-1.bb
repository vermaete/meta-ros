# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Aldebaran's libqicore: a layer on top of libqi"
AUTHOR = "Victor Paléologue <victor.paleologue@palaio.eu>"
ROS_AUTHOR = "Aldebaran"
HOMEPAGE = "https://github.com/aldebaran/libqicore"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "naoqi_libqicore"
ROS_BPN = "naoqi_libqicore"

ROS_BUILD_DEPENDS = " \
    naoqi-libqi \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    naoqi-libqi \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    naoqi-libqi \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-naoqi/libqicore-release/archive/release/humble/naoqi_libqicore/3.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/naoqi_libqicore"
SRC_URI = "git://github.com/ros-naoqi/libqicore-release;${ROS_BRANCH};protocol=https"
SRCREV = "e3e30d7e4d5c784ea1580f30b8359f84ddc194e9"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
