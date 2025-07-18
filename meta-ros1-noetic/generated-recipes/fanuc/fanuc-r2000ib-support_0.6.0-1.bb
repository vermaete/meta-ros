# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "<p>       ROS-Industrial support package for the Fanuc R-2000iB (and variants).     </p>     <p>       This package contains configuration data, 3D models and launch files       for Fanuc R-2000iB manipulators. This currently includes the /210F       variant only.     </p>     <p><b>Specifications</b>:</p>     <ul>       <li>R-2000iB/210F - &quot;J1 - Normal Range&quot;</li>     </ul>     <p>       Joint limits and maximum joint velocities are based on the information in       the <em>FANUC R-2000iB Mechanical Unit Operator's Manual</em>       version <em>B-82234EN/11</em>. All urdfs are based on the default motion       and joint velocity limits, unless noted otherwise (ie: no support for       high speed joints, extended / limited motion ranges or other options).     </p>     <p>       Before using any of the configuration files and / or meshes included       in this package, be sure to check they are correct for the particular       robot model and configuration you intend to use them with.     </p>"
AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute) <g.a.vanderhoorn@tudelft.nl>"
ROS_AUTHOR = "Ademola Oridate (Wilder Systems) <ademola.oridate@wsrobots.com>"
HOMEPAGE = "http://wiki.ros.org/fanuc_r2000ib_support"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=34;endline=34;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fanuc"
ROS_BPN = "fanuc_r2000ib_support"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fanuc-driver \
    fanuc-resources \
    industrial-robot-client \
    joint-state-publisher-gui \
    robot-state-publisher \
    rviz \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/fanuc-release/archive/release/noetic/fanuc_r2000ib_support/0.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fanuc_r2000ib_support"
SRC_URI = "git://github.com/ros-industrial-release/fanuc-release;${ROS_BRANCH};protocol=https"
SRCREV = "fd8289a2edf9c5ae048c95f1a3cae75a5b144d36"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
