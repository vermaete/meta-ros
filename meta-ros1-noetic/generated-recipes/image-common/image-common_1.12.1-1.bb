# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Common code for working with images in ROS."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/image_common"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_common"
ROS_BPN = "image_common"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-calibration-parsers \
    camera-info-manager \
    image-transport \
    polled-camera \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-calibration-parsers \
    camera-info-manager \
    image-transport \
    polled-camera \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/image_common-release/archive/release/noetic/image_common/1.12.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/image_common"
SRC_URI = "git://github.com/ros-gbp/image_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "3b37dccbac43728827f247a5d299cedc26d32740"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
