# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "ROS2 Meshes for the NAO robot"
AUTHOR = "Victor Paleologue <victor.paleologue@palaio.eu>"
ROS_AUTHOR = "Maxime Busy <mbusy@softbankrobotics.com>"
HOMEPAGE = "http://github.com/ros-naoqi/nao_meshes2/"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License"
LICENSE = "CC-BY-NC-ND-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=cc423ec78844eb7f9a98d5df4d0f6289"

ROS_CN = "nao_meshes"
ROS_BPN = "nao_meshes"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-java} \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-naoqi/nao_meshes-release/archive/release/humble/nao_meshes/2.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/nao_meshes"
SRC_URI = "git://github.com/ros-naoqi/nao_meshes-release;${ROS_BRANCH};protocol=https"
SRCREV = "a1b5adc1469d370672e3a05cfdf427b9560b073f"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
