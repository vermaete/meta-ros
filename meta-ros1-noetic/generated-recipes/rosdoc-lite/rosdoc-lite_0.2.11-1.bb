# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This ROS package wraps documentation tools like doxygen, sphinx,     and epydoc, making it convenient to generate ROS package     documentation.      It also generates online documentation for the ROS wiki."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Ken Conley"
HOMEPAGE = "http://wiki.ros.org/rosdoc_lite"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosdoc_lite"
ROS_BPN = "rosdoc_lite"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    python3-setuptools-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-kitchen} \
    doxygen \
    genmsg \
    graphviz \
    python3-catkin-pkg \
    python3-pyyaml \
    python3-rospkg \
    python3-sphinx \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/rosdoc_lite-release/archive/release/noetic/rosdoc_lite/0.2.11-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/rosdoc_lite"
SRC_URI = "git://github.com/ros-gbp/rosdoc_lite-release;${ROS_BRANCH};protocol=https"
SRCREV = "bd5367bedee524e30c61d5db9fd622c50f392275"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
